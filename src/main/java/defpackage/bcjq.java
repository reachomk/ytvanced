package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: bcjq */
public final class bcjq extends RejectedExecutionException {
    public bcjq() {
        super("Inline execution is prohibited for this request");
    }
}
