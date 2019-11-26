package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: qdq */
public final class qdq {
    private static final ComponentName a;
    private static final ComponentName b;

    public static String a(String str) {
        str = String.valueOf(str);
        String str2 = "com.google.android.gms.family.";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public static Intent a(qdo qdo) {
        return new Intent().setComponent(a).putExtras(((thm) qdo).a.a());
    }

    public static Intent a(qdt qdt) {
        return new Intent().setComponent(b).putExtras(((thn) qdt).a.a());
    }

    static {
        String str = "com.google.android.gms";
        ComponentName componentName = new ComponentName(str, "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        a = new ComponentName(str, "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        componentName = new ComponentName(str, "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
        b = new ComponentName(str, "com.google.android.gms.family.v2.manage.FamilyManagementActivity");
    }
}
