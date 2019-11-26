package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.IOException;

/* renamed from: utc */
public abstract class utc implements afpy {
    public final boolean a;
    private final ute b;
    private final Context c;
    private final tem d;

    protected utc(ute ute, Context context, tem tem, aott aott) {
        this.b = ute;
        this.c = context;
        this.d = tem;
        this.a = aott.c;
    }

    public abstract void a(Iterable iterable);

    public abstract afpz b(ust ust);

    public abstract String b(String str, Bundle bundle);

    public abstract void c(ust ust);

    @Deprecated
    public final afpz a(ust ust) {
        Bundle bundle;
        if (ust.e()) {
            bundle = new Bundle();
            bundle.putInt("delegation_type", 1);
            bundle.putString("delegatee_user_id", ust.a());
        } else {
            bundle = null;
        }
        return a(ust.b(), bundle);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized afpz a(String str, Bundle bundle) {
        try {
        } catch (tbf e) {
            if (this.a) {
                this.d.a(e.a, this.c);
            }
            return a(e);
        } catch (tbh e2) {
            return a(e2);
        } catch (tbd e3) {
            return new afpz(null, null, (Exception) amqw.a(e3));
        } catch (IOException e32) {
            return new afpz(null, null, (Exception) amqw.a(e32));
        }
        return afpz.a(b(str, bundle));
    }

    private final afpz a(tbh tbh) {
        ute ute = this.b;
        if (ute != null) {
            ute.a(new afqb(tbh.a(), tbh));
        }
        return new afpz(null, (Intent) amqw.a(tbh.a()), null);
    }
}
