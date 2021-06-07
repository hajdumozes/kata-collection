package sevenkyu.paintletterboxes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PaintLetterBoxesTest {
    PaintLetterBoxes paintLetterBoxes;

    @BeforeEach
    public void init() {
        paintLetterBoxes = new PaintLetterBoxes();
    }

    @Test
    public void paintLetterboxes_shouldReturnWithDigitOccurrence() {
        // Given
        // When
        int[] letters = paintLetterBoxes.paintLetterboxes(125, 132);
        // Then
        assertThat(letters).isEqualTo(new int[]{1, 9, 6, 3, 0, 1, 1, 1, 1, 1});
    }

}