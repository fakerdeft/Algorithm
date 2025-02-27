SELECT MCDP_CD AS '진료과코드', COUNT(MCDP_CD) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD >= '2022-05-01 00:00:00.000000' AND APNT_YMD <= '2022-05-31 23:59:59.999999'
GROUP BY MCDP_CD
ORDER BY 5월예약건수 ASC, 진료과코드 ASC