package com.example.petsshelter.data;

import android.provider.BaseColumns;
// contract class helps us to document the stucture of database (Schema).
// Your contract basically defines your database and how people should interact with it through the Content Provider.
public final class petContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private void PetContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class PetEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME ="name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";
        //  Possible values for the gender of the pet.
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
