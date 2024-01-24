#include<bits/stdc++.h>
#define int long long
#define endl "\n"
using namespace std;
const int N = 2e5 + 10;
vector<int> g[N];
int depth[N];
void dfs(int v,int par=-1){
    for(auto child:g[v]){
        if(child== par)
            continue;
        depth[child] = depth[v] + 1;
        dfs(child, v);
    }

}
int32_t main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n - 1; i++){
        int x, y;
        cin >> x >> y;
        g[x].push_back(y);
        g[y].push_back(x);
    }
    dfs(1);
    int mx_dpth = -1;
    int mx_dnod ;
    for (int i = 1; i <= n; i++){
        if(mx_dpth<depth[i]){
            mx_dpth = depth[i];
            mx_dnod = i;
        }
        depth[i] = 0;
    }
}