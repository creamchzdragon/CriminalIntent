package com.example.tyler.criminalintent;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Tyler on 3/29/2018.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private static Context mContext;
    private ArrayList<Crime> mCrimes = new ArrayList<>();

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        mContext=context;

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

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public boolean removeCrimeByID(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getmID().equals(id)) {
                mCrimes.remove(c);
                return true;
            }
        }
        return false;
    }

    public File getPhotoFile(Crime crime) {
        File externalFilesDir = mContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            return null;
        }
        return new File(externalFilesDir, crime.getPhotoFilename());

    }
}
