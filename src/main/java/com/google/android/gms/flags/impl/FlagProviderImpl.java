package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import defpackage.qcs;
import defpackage.qct;
import defpackage.qes;
import defpackage.qet;
import defpackage.qeu;
import defpackage.qev;
import defpackage.qex;
import defpackage.qqr;
import defpackage.qqt;

public class FlagProviderImpl extends qqr {
    private boolean a = false;
    private SharedPreferences b;

    public void init(qcs qcs) {
        Context context = (Context) qct.a(qcs);
        if (!this.a) {
            try {
                this.b = qex.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "Could not retrieve sdk flags, continuing with defaults: ";
                Log.w("FlagProviderImpl", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        Boolean bool;
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) qqt.a(new qet(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            str = String.valueOf(e.getMessage());
            String str2 = "Flag value not available, returning default: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            Log.w("FlagDataUtils", str);
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        Integer num;
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) qqt.a(new qes(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            str = String.valueOf(e.getMessage());
            String str2 = "Flag value not available, returning default: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            Log.w("FlagDataUtils", str);
            num = valueOf;
        }
        return num.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        Long l;
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) qqt.a(new qev(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            str = String.valueOf(e.getMessage());
            String str2 = "Flag value not available, returning default: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            Log.w("FlagDataUtils", str);
            l = valueOf;
        }
        return l.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            str = (String) qqt.a(new qeu(this.b, str, str2));
        } catch (Exception e) {
            str = String.valueOf(e.getMessage());
            String str3 = "Flag value not available, returning default: ";
            if (str.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(str);
            }
            Log.w("FlagDataUtils", str);
            str = str2;
        }
        return str;
    }
}
