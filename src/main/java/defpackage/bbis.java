package defpackage;

/* renamed from: bbis */
public final class bbis {
    private static final bbja A;
    private static final bbix B;
    private static final bbja C;
    @Deprecated
    public static final bbjw a = bbjw.a("canonical_status");
    @Deprecated
    public static final bbjw b = bbjw.a("method");
    public static final bbix c;
    public static final bbix d;
    public static final bbja e;
    public static final bbja f;
    @Deprecated
    public static final bbja g;
    @Deprecated
    public static final bbix h = q;
    @Deprecated
    public static final bbix i = r;
    @Deprecated
    public static final bbix j = s;
    @Deprecated
    public static final bbix k;
    @Deprecated
    public static final bbix l;
    @Deprecated
    public static final bbja m = w;
    @Deprecated
    public static final bbja n;
    @Deprecated
    public static final bbja o = t;
    @Deprecated
    public static final bbja p = u;
    private static final bbix q;
    private static final bbix r;
    private static final bbix s;
    private static final bbja t;
    private static final bbja u;
    private static final bbix v;
    private static final bbja w;
    private static final bbix x;
    private static final bbix y;
    private static final bbja z;

    static {
        bbjw.a("grpc_client_status");
        bbjw.a("grpc_server_status");
        bbjw.a("grpc_client_method");
        bbjw.a("grpc_server_method");
        String str = "By";
        q = bbix.a("grpc.io/client/sent_bytes_per_rpc", "Total bytes sent across all request messages per RPC", str);
        r = bbix.a("grpc.io/client/received_bytes_per_rpc", "Total bytes received across all response messages per RPC", str);
        String str2 = "Total bytes sent per method, recorded real-time as bytes are sent.";
        c = bbix.a("grpc.io/client/sent_bytes_per_method", str2, str);
        String str3 = "Total bytes received per method, recorded real-time as bytes are received.";
        d = bbix.a("grpc.io/client/received_bytes_per_method", str3, str);
        String str4 = "Total messages sent per method.";
        String str5 = "1";
        e = bbja.a("grpc.io/client/sent_messages_per_method", str4, str5);
        String str6 = "Total messages received per method.";
        f = bbja.a("grpc.io/client/received_messages_per_method", str6, str5);
        String str7 = "ms";
        s = bbix.a("grpc.io/client/roundtrip_latency", "Time between first byte of request sent to last byte of response received, or terminal error.", str7);
        t = bbja.a("grpc.io/client/sent_messages_per_rpc", "Number of messages sent in the RPC", str5);
        u = bbja.a("grpc.io/client/received_messages_per_rpc", "Number of response messages received per RPC", str5);
        v = bbix.a("grpc.io/client/server_latency", "Server latency in msecs", str7);
        w = bbja.a("grpc.io/client/started_rpcs", "Number of started client RPCs.", str5);
        String str8 = "RPC Errors";
        g = bbja.a("grpc.io/client/error_count", str8, str5);
        String str9 = "Uncompressed Request bytes";
        k = bbix.a("grpc.io/client/uncompressed_request_bytes", str9, str);
        String str10 = "Uncompressed Response bytes";
        l = bbix.a("grpc.io/client/uncompressed_response_bytes", str10, str);
        n = bbja.a("grpc.io/client/finished_count", "Number of client RPCs (streams) finished", str5);
        x = bbix.a("grpc.io/server/sent_bytes_per_rpc", "Total bytes sent across all response messages per RPC", str);
        y = bbix.a("grpc.io/server/received_bytes_per_rpc", "Total bytes received across all messages per RPC", str);
        bbix.a("grpc.io/server/sent_bytes_per_method", str2, str);
        bbix.a("grpc.io/server/received_bytes_per_method", str3, str);
        bbja.a("grpc.io/server/sent_messages_per_method", str4, str5);
        bbja.a("grpc.io/server/received_messages_per_method", str6, str5);
        z = bbja.a("grpc.io/server/sent_messages_per_rpc", "Number of messages sent in each RPC", str5);
        A = bbja.a("grpc.io/server/received_messages_per_rpc", "Number of messages received in each RPC", str5);
        B = bbix.a("grpc.io/server/server_latency", "Time between first byte of request received to last byte of response sent, or terminal error.", str7);
        C = bbja.a("grpc.io/server/started_rpcs", "Number of started server RPCs.", str5);
        bbja.a("grpc.io/server/error_count", str8, str5);
        bbix.a("grpc.io/server/server_elapsed_time", "Server elapsed time in msecs", str7);
        bbix.a("grpc.io/server/uncompressed_request_bytes", str9, str);
        bbix.a("grpc.io/server/uncompressed_response_bytes", str10, str);
        bbja.a("grpc.io/server/finished_count", "Number of server RPCs (streams) finished", str5);
    }
}
