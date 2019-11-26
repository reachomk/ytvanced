package defpackage;

import android.content.Context;
import android.provider.Settings.Global;
import java.util.ArrayList;
import java.util.List;

/* renamed from: csn */
final class csn {
    static void a(csd csd, crr crr, cto cto, cry cry) {
        int i = 0;
        if (crr instanceof cso) {
            ArrayList arrayList = ((cso) crr).c;
            int size = arrayList.size();
            while (i < size) {
                csn.a(csd, (crr) arrayList.get(i), cto, cry);
                i++;
            }
        } else if (crr instanceof csb) {
            csb csb = (csb) crr;
            cru cru = csb.c;
            if (csd.b.equals(csb.c.a.a) && cto.equals(csb.c.b.a)) {
                cry.a = true;
                if (csb.a()) {
                    cry.b = csb;
                }
            }
        } else if (crr instanceof crt) {
            ArrayList b = ((crt) crr).b();
            int size2 = b.size();
            while (i < size2) {
                csn.a(csd, (crr) b.get(i), cto, cry);
                i++;
            }
        } else {
            String valueOf = String.valueOf(crr);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
            stringBuilder.append("Unhandled transition type: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static boolean a(Context context) {
        if (!cuj.a) {
            return false;
        }
        if (!cuj.d) {
            return true;
        }
        if (!cuj.b || Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            return false;
        }
        return true;
    }

    static void a(crr crr, List list, String str) {
        if (crr instanceof crt) {
            list.addAll(((crt) crr).b());
        } else if (crr != null) {
            list.add(crr);
        } else {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 49);
            stringBuilder.append("[");
            stringBuilder.append(str);
            stringBuilder.append("] Adding null to transition list is not allowed.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
