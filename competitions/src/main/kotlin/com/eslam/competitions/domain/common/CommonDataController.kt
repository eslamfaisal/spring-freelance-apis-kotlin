package com.eslam.competitions.domain.common

import com.eslam.competitions.domain.answer.entity.Answer
import com.eslam.competitions.domain.answer.service.AnswerService
import com.eslam.competitions.domain.category.entity.Category
import com.eslam.competitions.domain.category.service.CategoryService
import com.eslam.competitions.domain.question.entity.Question
import com.eslam.competitions.domain.question.service.QuestionService
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.IOException
import javax.transaction.Transactional


@RestController
class CommonDataController(
    private val categoryService: CategoryService,
    private val answerService: AnswerService,
    private val questionService: QuestionService
) {

    @Transactional
    @PostMapping("/common_data_export")
    @Throws(IOException::class)
    fun mapReapExcelDatatoDB(
        @RequestParam("file") reapExcelDataFile: MultipartFile,
        @RequestParam("name") name: String
    ): String {

        val category: Category = categoryService.createCategory(Category(name = name))

        val workbook = XSSFWorkbook(reapExcelDataFile.inputStream)
        val worksheet = workbook.getSheetAt(0)


        for (i in 1 until worksheet.physicalNumberOfRows) {
            val row = worksheet.getRow(i)

            val question: Question = questionService.createQuestion(
                Question(
                    question = getCellValueAsString(row, 3),
                    category = category,
                    rightAnswer = getCellValueAsString(row, 7).toInt()
                )
            )
            answerService.createAnswer(
                Answer(
                    answer = getCellValueAsString(row, 4),
                    number = 1,
                    question_id = question.id
                )
            )
            answerService.createAnswer(
                Answer(
                    answer = getCellValueAsString(row, 5), number = 2,
                    question_id = question.id
                )
            )
            answerService.createAnswer(
                Answer(
                    answer = getCellValueAsString(row, 6), number = 2,
                    question_id = question.id
                )
            )

        }

        return "Saves Successfully"
    }

    fun getCellValueAsString(row: XSSFRow, cellNum: Int): String {
        return if (row.getCell(cellNum).cellType == CellType.STRING)
            row.getCell(cellNum).stringCellValue.toString()
        else row.getCell(cellNum).numericCellValue.toInt().toString()
    }
}