package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;

/* renamed from: abti */
final class abti implements wqg {
    private final /* synthetic */ abta a;

    abti(abta abta) {
        this.a = abta;
    }

    public final void a(atpm atpm) {
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction = atpm.b == 2 ? (CompleteTransactionActionOuterClass$CompleteTransactionAction) atpm.c : CompleteTransactionActionOuterClass$CompleteTransactionAction.d;
        atqm atqm = completeTransactionActionOuterClass$CompleteTransactionAction.b;
        if (atqm == null) {
            atqm = atqm.c;
        }
        if (atqm.a != 136403337) {
            this.a.e();
            return;
        }
        aucy aucy;
        abta abta = this.a;
        atqm atqm2 = completeTransactionActionOuterClass$CompleteTransactionAction.b;
        if (atqm2 == null) {
            atqm2 = atqm.c;
        }
        if (atqm2.a == 136403337) {
            aucy = (aucy) atqm2.b;
        } else {
            aucy = aucy.e;
        }
        arml arml = aucy.b;
        if (arml == null) {
            arml = arml.f;
        }
        abta.a(ajqy.a(arml));
    }

    public final void a(bqn bqn) {
        this.a.a(bqn.getLocalizedMessage());
    }
}
