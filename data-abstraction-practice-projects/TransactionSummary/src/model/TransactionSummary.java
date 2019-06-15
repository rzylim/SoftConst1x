package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionSummary {

    private String name;
    private List<Transaction> transactions;

    public TransactionSummary(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public int getNumTransactions() {
        return transactions.size();
    }

    // REQUIRES: t is not already within transactions
    // MODIFIES: this
    // EFFECTS: adds the given transaction t to the list of transactions
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {
        double sum = 0;
        for(Transaction trans : transactions){
            sum += trans.getAmount();
        }
        return sum / transactions.size();
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS:  returns the average cost of all transactions of type specificType in this
    //           TransactionSummary
    public double specificTypeAverage(TransactionType specificType) {
        double sum = 0;
        int count = 0;
        for(Transaction trans : transactions){
            if(trans.getType().equals(specificType)){
            //if(trans.getType() == specificType){
                sum += trans.getAmount();
                count++;
            }
        }
        if(count > 0) {
            return sum / count;
        } else{
            return 0;
        }

    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary
    public Transaction largestTransaction() {
        Transaction mem = transactions.get(0);
        for(Transaction trans : transactions){
            if(trans.getAmount() > mem.getAmount()){
                mem = trans;
            }
        }
        return mem;
    }

    // EFFECTS: returns true if the given transaction is contained within the list of transactions
    public boolean contains(Transaction t) {
        return transactions.contains(t);
    }
}
