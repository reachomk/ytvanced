package defpackage;

import android.view.View.OnClickListener;

/* renamed from: yct */
public final class yct {
    public final akvg a = new akvg();

    public yct(OnClickListener onClickListener) {
        this.a.c = onClickListener;
    }

    public static String a(Object obj) {
        if (obj instanceof aqoz) {
            aqoz aqoz = (aqoz) obj;
            if ((aqoz.a & 1) != 0) {
                return aqoz.b;
            }
            return null;
        } else if (obj instanceof aqox) {
            aqox aqox = (aqox) obj;
            if ((aqox.a & 64) != 0) {
                return aqox.h;
            }
            return null;
        } else if (obj instanceof akvg) {
            return "EXPAND_BUTTON_MODEL_ID";
        } else {
            if (obj instanceof akwl) {
                return "LOADING_STATUS_ID";
            }
            if (obj instanceof aqir) {
                return "CONNECTION_SHELF_ID";
            }
            return null;
        }
    }
}
