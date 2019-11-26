package defpackage;

import com.google.protos.youtube.api.innertube.CreateGroupCommandOuterClass$CreateGroupCommand;
import java.util.Map;

/* renamed from: xzu */
public final class xzu implements aaap {
    private final aarh a;

    public xzu(aarh aarh) {
        this.a = (aarh) amqw.a((Object) aarh);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CreateGroupCommandOuterClass$CreateGroupCommand.createGroupCommand);
        apxu.a(access$000);
        amqw.b(apxu.h.a(access$000.d));
        String str = (String) xsb.a(map, (Object) "create_group_name", String.class);
        afsw afsw = (afsw) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", afsw.class);
        aarh aarh = this.a;
        aaml aatf = new aatf(aarh.c, aarh.d.c(), str);
        aatf.g();
        aarh.a(asjr.d, aarh.g, aasq.a, aast.a).a(aatf, afsw);
    }
}
