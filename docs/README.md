## Analisis de diagrama


## Puntos en contra
- Consideramos que HangedMan no debería estar compuesto por SecretWord, ya que HangedMan no está compuesto de la palabra a adivinar como tal.
- Round no debería depender de AsignRoles, si bien estos deben tener comunicación pero la ronda no está depende de la asignación de roles, sino del orden en el que estos juegan.
- HangMan no debería depender de SelectPlayers, este hará uso de ellos pero no depende como tal de SelectPlayers. 


## Mejoras
- En el Round en ves de implementar los assignRoles deberiamos utilizarlos.
- En el WordGuesserable en ves de estar compuesto por las acciones deberia utilizarlas.
- El turn deberia estar compuesto por HangedMan y SecretWord.

