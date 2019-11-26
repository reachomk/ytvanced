package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import java.util.Map;

/* renamed from: zsm */
public class zsm implements aaap {
    public final zta a;
    public final aaas b;

    public zsm(zta zta, aaas aaas) {
        this.a = zta;
        this.b = aaas;
    }

    public final void a(apxu apxu, Map map) {
        amqw.a((Object) apxu);
        String a = a(apxu);
        if (!TextUtils.isEmpty(a)) {
            zsn zsn = null;
            if (map != null) {
                Object obj = map.get("accountLinkChangeListener");
                if (obj instanceof zsn) {
                    zsn = (zsn) obj;
                }
            }
            if (zsn != null) {
                zsn.a();
            }
            a(a, new zsp(this, apxu, map, zsn));
        }
    }

    /* Access modifiers changed, original: protected */
    public String a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) b;
        return (accountLinkCommandOuterClass$AccountLinkCommand.a & 4) != 0 ? accountLinkCommandOuterClass$AccountLinkCommand.d : null;
    }

    /* Access modifiers changed, original: protected */
    public apxu b(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) b;
        if ((accountLinkCommandOuterClass$AccountLinkCommand.a & 1) == 0) {
            return null;
        }
        apxu = accountLinkCommandOuterClass$AccountLinkCommand.b;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected */
    public apxu c(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) b;
        if ((accountLinkCommandOuterClass$AccountLinkCommand.a & 2) == 0) {
            return null;
        }
        apxu = accountLinkCommandOuterClass$AccountLinkCommand.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected */
    public apxu d(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) b;
        if ((accountLinkCommandOuterClass$AccountLinkCommand.a & 8) == 0) {
            return null;
        }
        apxu = accountLinkCommandOuterClass$AccountLinkCommand.e;
        if (apxu == null) {
            apxu = apxu.d;
        }
        return apxu;
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, zte zte) {
        zta zta = this.a;
        zta.a.a(str);
        zta.a.b = zte;
        zta.d.execute(new ztd(zta, str));
    }
}
