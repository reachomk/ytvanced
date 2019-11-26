package defpackage;

/* renamed from: ewy */
final class ewy implements wpk {
    private final /* synthetic */ ewr a;

    public final void a() {
        this.a.a("transactionStarted");
    }

    public final void d() {
    }

    public final void a(abma abma) {
        ewv ewv = this.a.d;
        if (ewv != null) {
            adjb adjb = ewv.a;
            if (adjb != null) {
                String valueOf = String.valueOf(adjb.a);
                String str = "setting the screenID back to CompleteTxnRequest to: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                abma.u = aali.b(this.a.d.a.a);
                return;
            }
        }
        xtl.a("RemoteTransactionController", "onTransactionReady: no valid screenID");
    }

    public final void a(akcf akcf) {
        this.a.a("transactionCompleted");
        ewr ewr = this.a;
        ewv ewv = ewr.d;
        if (ewv != null) {
            ewr.e.add(ewv.b);
        }
        ewr.d = null;
        this.a.c();
    }

    public final void a(CharSequence charSequence) {
        this.a.a("transactionError");
    }

    public final void b() {
        this.a.a("transactionCanceled");
    }

    public final void c() {
        this.a.a("transactionError");
    }

    /* synthetic */ ewy(ewr ewr) {
        this.a = ewr;
    }
}
