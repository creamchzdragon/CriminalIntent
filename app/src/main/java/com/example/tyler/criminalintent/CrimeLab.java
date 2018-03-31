package com.example.tyler.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Tyler on 3/29/2018.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private ArrayList<Crime> mCrimes=new ArrayList<>();
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        //TODO remove me!
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setmSolved(i % 2 == 0); // Every other
            mCrimes.add(crime);
        }

    }

    public List<Crime> getCrimes() {
        return mCrimes;

    }
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getmID().equals(id)) {
                return crime;
            }
        }
        return null;
    }

}
