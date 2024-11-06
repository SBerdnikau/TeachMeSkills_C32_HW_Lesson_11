package com.teachmeskills.lesson_11.task1.service;

public class ServiceOperationFile {

    public static void showFirstTwoBlocks(String documentNumber) {
        String[] parts = documentNumber.split("-");
        System.out.println(parts[0] + parts[2]);
    }

    public static void showDocumentWithMask(String documentNumber) {
        String modifiedDocument = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedDocument);
    }

    public static void showLettersInLowerCase(String documentNumber) {
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "");
        String formattedLetters = lettersOnly.toLowerCase().replaceAll("(.{3})(.{3})(.{1})(.{1})", "$1/$2/$3/$4");//примеры смотрел на StackOverflow
        System.out.println(formattedLetters);
    }

    public static void showLettersInUpperCase(String documentNumber) {
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "");
        StringBuilder formattedLetters = new StringBuilder("Letters:");
        formattedLetters.append(lettersOnly.toUpperCase().replaceAll("(.{3})(.{3})(.{1})(.{1})", "$1/$2/$3/$4"));
        System.out.println(formattedLetters.toString());
    }

    public static boolean checkContainsSequence(String documentNumber, String sequence) {
        if (documentNumber.toLowerCase().contains(sequence.toLowerCase())) {
            System.out.println("The document contains a sequence" + sequence);
            return true;
        } else {
            System.out.println("The document does not contain a sequence " + sequence);
            return false;
        }
    }

    public static boolean checkStartsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.startsWith(sequence)) {
            System.out.println("The document begins with a sequence " + sequence);
            return true;
        } else {
            System.out.println("The document does not start with a sequence" + sequence);
            return false;
        }
    }

    public static boolean checkEndsWithSequence(String documentNumber, String sequence) {
        if (documentNumber.endsWith(sequence)) {
            System.out.println("The document ends with the sequence " + sequence);
            return true;
        } else {
            System.out.println("The document does not end with a sequence " + sequence);
            return false;
        }
    }

}