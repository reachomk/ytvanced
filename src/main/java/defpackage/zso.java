package defpackage;

import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;

/* renamed from: zso */
public final class zso extends zsm {
    public zso(zta zta, aaas aaas) {
        super(zta, aaas);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) b;
        return (accountUnlinkCommandOuterClass$AccountUnlinkCommand.a & 4) != 0 ? accountUnlinkCommandOuterClass$AccountUnlinkCommand.d : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final apxu b(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) b;
        if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand.a & 1) == 0) {
            return null;
        }
        apxu = accountUnlinkCommandOuterClass$AccountUnlinkCommand.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected|final */
    public final apxu c(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) b;
        if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand.a & 2) == 0) {
            return null;
        }
        apxu = accountUnlinkCommandOuterClass$AccountUnlinkCommand.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected|final */
    public final apxu d(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = (AccountUnlinkCommandOuterClass$AccountUnlinkCommand) b;
        if ((accountUnlinkCommandOuterClass$AccountUnlinkCommand.a & 8) == 0) {
            return null;
        }
        apxu = accountUnlinkCommandOuterClass$AccountUnlinkCommand.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, zte zte) {
        zta zta = this.a;
        zta.a.a(str);
        zta.d.execute(new ztc(zta, str, zte));
    }
}
