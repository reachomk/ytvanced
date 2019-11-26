package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: afzb */
public final class afzb implements wxx {
    private final Context a;

    public afzb(Context context) {
        this.a = context;
    }

    public final int a(Bundle bundle) {
        Object string = bundle.getString("servicePath");
        String string2;
        try {
            string = Class.forName(string);
            string2 = bundle.getString("intentAction");
            Context context = this.a;
            xva.a(context, new Intent(context, string).setAction(string2));
            return 0;
        } catch (ClassNotFoundException unused) {
            string2 = String.valueOf(string);
            String str = "Cannot find class: ";
            xtl.c(string2.length() == 0 ? new String(str) : str.concat(string2));
            return 1;
        }
    }
}
