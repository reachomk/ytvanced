package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bhn */
public final class bhn {
    public final Map a = new HashMap();
    public View b;
    public final ArrayList c = new ArrayList();

    public bhn(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhn) {
            bhn bhn = (bhn) obj;
            if (this.b == bhn.b && this.a.equals(bhn.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.b);
        stringBuilder2 = "\n";
        stringBuilder3.append(stringBuilder2);
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append("    values:");
        stringBuilder4 = stringBuilder5.toString();
        for (String str : this.a.keySet()) {
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(stringBuilder4);
            stringBuilder6.append("    ");
            stringBuilder6.append(str);
            stringBuilder6.append(": ");
            stringBuilder6.append(this.a.get(str));
            stringBuilder6.append(stringBuilder2);
            stringBuilder4 = stringBuilder6.toString();
        }
        return stringBuilder4;
    }
}
