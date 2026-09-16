rent_cost = 50000
salary_per_emp = 40000
emp_count = 3
revenue = 300000

total_expenses = rent_cost + (salary_per_emp * emp_count)
profit = revenue - total_expenses
profitability = (profit / total_expenses) * 100

print("--- Бизнес-план ---")
print(f"Общие расходы:  {total_expenses} руб.")
print(f"Прибыль:        {profit} руб.")
print(f"Рентабельность: {profitability:.2f} %")
