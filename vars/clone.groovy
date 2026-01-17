def call(string url, string branch){
    echo "Cloning the code...."
    git url: "${url}", branch: "${branch}"
    echo "code cloned"
}
