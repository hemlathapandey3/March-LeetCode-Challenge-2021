public class Codec {

    // Encodes a URL to a shortened URL.
    Map<String,String> m = new HashMap<>();
    
    
    public String encode(String longUrl) {
    String s = "http://tinyurl.com"+m.size();
        m.put(s,longUrl);
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
