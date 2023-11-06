package lotto.domain;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void issueTicket(List<List<Integer>> purchasedLottoTickets) {
        purchasedLottoTickets.add(numbers);
        System.out.println(numbers);
    }

}
