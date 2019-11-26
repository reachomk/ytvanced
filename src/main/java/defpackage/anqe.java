package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: anqe */
final /* synthetic */ class anqe implements rye {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final ryl d;

    anqe(FirebaseInstanceId firebaseInstanceId, String str, String str2, ryl ryl) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = ryl;
    }

    public final void a(ryi ryi) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        ryl ryl = this.d;
        if (ryi.b()) {
            String str3 = (String) ryi.d();
            FirebaseInstanceId.a.a("", str, str2, str3, firebaseInstanceId.d.b());
            ryl.a(new anqj(str3));
            return;
        }
        ryl.a(ryi.e());
    }
}
