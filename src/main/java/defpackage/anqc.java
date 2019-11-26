package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: anqc */
final /* synthetic */ class anqc implements Runnable {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final ryl d;
    private final String e;

    anqc(FirebaseInstanceId firebaseInstanceId, String str, String str2, ryl ryl, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = ryl;
        this.e = str3;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        ryl ryl = this.d;
        String str3 = this.e;
        String c = FirebaseInstanceId.c();
        anpm a = FirebaseInstanceId.a(str, str2);
        if (a == null || a.b(firebaseInstanceId.d.b())) {
            anpm.a(a);
            firebaseInstanceId.f.a(str, str3, new anqb(firebaseInstanceId, c, str, str3)).a(firebaseInstanceId.b, new anqe(firebaseInstanceId, str, str3, ryl));
            return;
        }
        ryl.a(new anqj(a.a));
    }
}
