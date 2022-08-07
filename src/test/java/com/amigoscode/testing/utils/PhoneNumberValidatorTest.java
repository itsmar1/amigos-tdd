package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp() {
        underTest = new PhoneNumberValidator();
    }

    @Test
    void itShouldValidatePhoneNumber() {
        // Given
        String phoneNumber = "+447000000000";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isTrue();
    }
}
