package defpackage;

import android.os.IInterface;

/* renamed from: qqs */
public interface qqs extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(qcs qcs);
}
