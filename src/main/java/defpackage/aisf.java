package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: aisf */
public final class aisf {
    public static aisg a(aiqq aiqq, aiqw aiqw, String str, amqd amqd, amqd amqd2, Executor executor) {
        if (!TextUtils.isEmpty(aiqq.b())) {
            return new aisg((anjv) amqd.a(aish.a(aiqq, aiqw, str)), ampo.a);
        }
        anjv anjv = (anjv) amqd2.a(aiqq);
        return new aisg(anic.a(anjv, new aise(amqd, aiqq, aiqw, str), executor), amqp.b(anjv));
    }
}
