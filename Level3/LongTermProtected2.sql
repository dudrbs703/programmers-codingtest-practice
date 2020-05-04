-- 코드를 입력하세요

SELECT
    outs.ANIMAL_ID,
    outs.NAME
    
FROM
    ANIMAL_OUTS AS outs
    LEFT JOIN ANIMAL_INS AS ins
    ON ins.ANIMAL_ID = outs.ANIMAL_ID
    
WHERE
    ins.ANIMAL_ID IS NOT NULL
    
ORDER BY 
    ins.DATETIME  - outs.DATETIME ASC

LIMIT 2