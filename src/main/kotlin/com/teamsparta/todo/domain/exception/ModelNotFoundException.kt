package com.teamsparta.todo.domain.exception

data class ModelNotFoundException(val modelName: String, val id: String): RuntimeException(
    "Model $modelName not found with give id: $id"
)