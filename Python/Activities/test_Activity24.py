import pytest

# Set up the paremeterized test method
@pytest.mark.Activity
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_balance(wallet_amount, earned, spent, expected):
	
    # Add money to your wallet
    wallet_amount += earned

    # Subtract amount from wallet
    wallet_amount -= spent

    # Assertion
    assert wallet_amount == expected