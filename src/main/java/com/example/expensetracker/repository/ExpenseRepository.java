package com.example.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expensetracker.dao.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
