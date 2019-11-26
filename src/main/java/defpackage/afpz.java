package defpackage;

import android.content.Intent;
import android.util.Pair;

/* renamed from: afpz */
public final class afpz {
    private final String a;
    private final Intent b;
    private final Exception c;

    public static afpz a(String str) {
        return new afpz(xvd.a(str), null, null);
    }

    public afpz(String str, Intent intent, Exception exception) {
        this.a = str;
        this.b = intent;
        this.c = exception;
    }

    protected afpz() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final String c() {
        if (a()) {
            return this.a;
        }
        throw new IllegalStateException("Cannot call getValue on an unsuccessful fetch.");
    }

    public final Pair d() {
        if (a()) {
            String valueOf = String.valueOf(this.a);
            String str = "Bearer ";
            return Pair.create("Authorization", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        throw new IllegalStateException("Cannot call getAuthenticationHeaderInfo on an unsuccessful fetch.");
    }

    public final Intent e() {
        if (a()) {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on a successful fetch.");
        } else if (b()) {
            return this.b;
        } else {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on an unrecoverable fetch.");
        }
    }

    public final Exception f() {
        Exception exception = this.c;
        if (exception != null) {
            return exception;
        }
        throw new IllegalStateException("Cannot call getException() on a successful or recoverable fetch.");
    }
}
