-- 코드를 입력하세요
SELECT 
    ANIMAL_ID, NAME, 
    IF(SEX_UPON_INTAKE="Neutered Male" OR SEX_UPON_INTAKE="Spayed Female", "O", "X") AS 중성화
FROM ANIMAL_INS