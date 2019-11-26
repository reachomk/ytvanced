package defpackage;

import com.google.protos.youtube.api.innertube.HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;

/* renamed from: zyl */
final /* synthetic */ class zyl implements amqv {
    private final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand a;

    zyl(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand) {
        this.a = hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
    }

    public final boolean a(Object obj) {
        return obj instanceof aqgs ? this.a.b.equals(((aqgs) obj).c) : false;
    }
}
