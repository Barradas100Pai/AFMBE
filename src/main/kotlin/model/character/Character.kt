package model.character

import model.generalModules.Endurance
import model.generalModules.Health

class Character(
    val name: String,
    val level: Int,
    val health: Health,
    val endurance: Endurance,
    val stats: Stats,
    val gear: List<String>, //LIST<QUALITIES>
    val skills : List<String>, //LIST<SKILLS>
    val personality: List<String> //LIST<PERSONALITY>
) {
    //TODO()
}