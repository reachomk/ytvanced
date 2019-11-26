package defpackage;

import android.os.Bundle;

/* renamed from: adis */
public abstract class adis {
    public abstract String b();

    public abstract int bs_();

    public boolean bt_() {
        return false;
    }

    public abstract String bv_();

    public Bundle l() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", b());
        int bs_ = bs_();
        int i = bs_ - 1;
        if (bs_ != 0) {
            bundle.putInt("mdx_session_type", i);
            return bundle;
        }
        throw null;
    }

    public static int b(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("mdx_session_type", -1);
            if (i != -1) {
                i = aurr.b(i);
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return i;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }
}
