-- 코드를 입력하세요

SELECT
    ins.NAME,
    ins.DATETIME
    
FROM 
    ANIMAL_INS AS ins
    LEFT JOIN ANIMAL_OUTS AS outs
    ON ins.ANIMAL_ID = outs.ANIMAL_ID

WHERE
    ins.ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
    
ORDER BY 
    ins.DATETIME ASC

LIMIT 3