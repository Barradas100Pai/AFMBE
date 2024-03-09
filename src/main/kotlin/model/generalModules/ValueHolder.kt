package model.generalModules

abstract class ValueHolder(
    val maxValue: Int,
    val currentValue: Int
)

class Health(
    maxHealth: Int,
    currentHealth: Int
) : ValueHolder(maxHealth, currentHealth) {
    //TODO()
}

class Endurance(
    maxEndurance: Int,
    currentEndurance: Int
) : ValueHolder(maxEndurance, currentEndurance) {
    //TODO()
}