# Exercises 8 & 10 — Types

## Exercise 8 — Type Detective

For each value, pick the best Java type and justify it in **one sentence.** The justification is the point of the exercise.

| # | Value to store | Type | Why |
|---|---|---|---|
| 1 | A student's age | int | because its a whole number |
| 2 | The price of a coffee | double | price could include decimals to the nearest hundredths |
| 3 | Whether a student is enrolled | boolean | because its true or false |
| 4 | A student's middle initial | char | because its a single charachter |
| 5 | A phone number | String | there are charachters besides numbers |
| 6 | The population of New York City | int | because its a whole number |
| 7 | A test score out of 100 | double | because there are decimals |
| 8 | A GPA | double | there are decimals |
| 9 | Whether it is currently raining | boolean | true or flase |
| 10 | A student ID like `0074512` | String | there are things other than numbers |

### Traps to think carefully about

**#5 — Phone number.** It's made of digits, so `int` feels right. Why is it wrong?

there are other charachters that are not numbers

**#10 — Student ID.** Same question, plus one more problem `int` would cause.

Because its a randomly genreated number no mathematical

**#6 — Population of NYC.** About 8.3 million. Does that fit in an `int`? What about the population of Earth?

it does because its a whole number there cant be half people

---

## Exercise 10 — Your Project's Data (Homework)

Think about your project idea. What are the five most important pieces of information it needs to store?
A movie and show app where you document the things youve seen, ratings and reveiws
| # | What it stores | Type | Example value | Why this type |
|---|---|---|---|---|
| 1 | Movie name|String | "prisoners"| because its only words |
| 2 |Movie summary | string  | "Prisoners is a 2013 dark crime thriller directed by Denis Villeneuve" | because its only words |
| 3 | average rating | double | 9.25 | because there are decmials|
| 4 | fan reveiw | string|I really loved this movie |because there are no words |
| 5 | movie lists| string|1. Prisoners 2. The Dark Night | because it includes more than numbers|

**Is there anything your project needs to store that doesn't fit any of these types?**
no
[your answer — this is a good question to be stuck on. It's usually a sign you need a *list* of something, or your own class. Both are coming.]
