package defpackage;

import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;

/* renamed from: ayro */
public final class ayro extends anxo implements anzf {
    private ayro() {
        super(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.e);
    }

    public final ayro a(int i) {
        copyOnWrite();
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction) this.instance;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction.a |= 8;
        updateBackstagePollActionOuterClass$UpdateBackstagePollAction.d = i;
        return this;
    }

    public /* synthetic */ ayro(byte b) {
        super(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.e);
    }
}
