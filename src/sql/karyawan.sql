SELECT
e.id,e.name,address,phone_number,gender,o.name AS occupation,d.name AS department,b.name AS branch,status
FROM employee AS e
JOIN occupation AS o
ON e.occ_id = o.id
JOIN department AS d
ON e.dept_id = d.id
JOIN branch as b
ON e.branch_id = b.id;