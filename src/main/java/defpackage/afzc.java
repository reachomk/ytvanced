package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: afzc */
public final class afzc implements wxx {
    private final Context a;

    public afzc(Context context) {
        this.a = context;
    }

    public final int a(Bundle bundle) {
        Object string = bundle.getString("servicePath");
        try {
            string = Class.forName(string);
            String string2 = bundle.getString("intentAction");
            String str = "messageId";
            String str2 = "messageData";
            xva.a(this.a, new Intent(this.a, string).setAction(string2).putExtra(str, bundle.getInt(str)).putExtra(str2, bundle.getString(str2)));
            return 0;
        } catch (ClassNotFoundException unused) {
            String valueOf = String.valueOf(string);
            String str3 = "Cannot find class: ";
            xtl.c(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            return 1;
        }
    }
}
