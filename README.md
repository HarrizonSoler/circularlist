# Reto: Resolver el problema de Josephus

*Participantes:* 3 personas

*Enunciado:* Usando la lista circular, implementa el **[problema de Josephus](https://youtu.be/pkq_6DXycZg?si=r-quFc5qvowdVN2Y)**: en un grupo de `n` personas numeradas, se elimina cada `k`-ésima persona hasta que solo quede una.

*Resultado esperado:*

```txt
Personas: 1 -> 2 -> 3 -> 4 -> 5 -> (regresa a 1)
k = 3

Personas tras eliminaciones:
Personas: 1 -> 2 -> 4 -> 5 (se elimina al 3, continua desde el 4)
Personas: 2 -> 4 -> 5 (se elimina al 1, continua desde el 2)
Personas: 2 -> 4 (se elimina al 5, continua desde el 2)
Personas: 4 (se elimina al 2, continua desde el 4)

Persona sobreviviente: 4
```

```txt
Personas: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> 12 -> (regresa a 1)
k = 6

Personas tras eliminaciones:
Personas: 1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 -> 12 (se elimina al 6, continua desde el 7)
Personas: 1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9 -> 10 -> 11 (se elimina al 12, continua desde el 1)
Personas: 1 -> 2 -> 3 -> 4 -> 5 -> 8 -> 9 -> 10 -> 11 (se elimina al 7, continua desde el 8)
Personas: 1 -> 3 -> 4 -> 5 -> 8 -> 9 -> 10 -> 11 (se elimina al 2, continua desde el 3)
Personas: 1 -> 3 -> 4 -> 5 -> 8 -> 9 -> 11 (se elimina al 10, continua desde el 11)
Personas: 1 -> 3 -> 4 -> 5 -> 9 -> 11 (se elimina al 8, continua desde el 9)
Personas: 1 -> 3 -> 4 -> 9 -> 11 (se elimina al 5, continua desde el 9)
Personas: 1 -> 3 -> 4 -> 11 (se elimina al 9, continua desde el 11)
Personas: 3 -> 4 -> 11 (se elimina al 1, continua desde el 3)
Personas: 3 -> 4 (se elimina al 11, continua desde el 3)
Personas: 3 (se elimina al 4, continua desde el 3)

Persona sobreviviente: 3
```

*Pistas o ayudas:*

- Usa la lista circular para avanzar `k` posiciones y eliminar el nodo actual.
- Repite el proceso hasta que solo quede un nodo en la lista.
