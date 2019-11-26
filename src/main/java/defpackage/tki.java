package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: tki */
abstract class tki implements tke {
    public final GoogleHelp a;

    tki(String str) {
        this.a = new GoogleHelp(str);
    }

    public abstract void b(thu thu, File file);

    public final tke a(Account account) {
        this.a.a = account;
        return this;
    }

    public final tke a(Uri uri) {
        this.a.b = uri;
        return this;
    }

    public final tke b() {
        this.a.c = true;
        return this;
    }

    public final tke a(thu thu, File file) {
        b(thu, file);
        return this;
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this.a);
    }
}
