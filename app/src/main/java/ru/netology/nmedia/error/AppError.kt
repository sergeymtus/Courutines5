package ru.netology.nmedia

import java.lang.RuntimeException

sealed class AppError(var code : String) : RuntimeException()
class ApiError(val status : Int, code : String) : AppError(code)
object NetworkError : AppError("error_network")
object UnknownAppError : AppError("error_unknown")
