// Quiz questions array
const quizQuestions = [
  { question: "What is the capital of India?", answer: "Delhi" },
  { question: "Which planet is known as the Red Planet?", answer: "mars" },
  { question: "What is 57+3?", answer: "60" },
  { question: "Who is Prime Minister of india?", answer: "Narendra Modi" },
  { question: "Which language is used for web development?", answer: "javascript" }
];

// Function to run the quiz
function runQuiz() {
  let score = 0; // Initialize score

  for (let i = 0; i < quizQuestions.length; i++) {
    const userAnswer = prompt(quizQuestions[i].question);

    // Check answer (case-insensitive + trimmed)
    if (userAnswer &&
        userAnswer.toLowerCase().trim() === quizQuestions[i].answer.toLowerCase().trim()
    ) {
      alert("Correct!");
      score++;
    } else {
      alert(`Wrong! The correct answer is: ${quizQuestions[i].answer}`);
    }
  }

  // Final score
  alert(`Quiz Over! Your final score is ${score} out of ${quizQuestions.length}`);
}

// Run the quiz automatically
runQuiz();
