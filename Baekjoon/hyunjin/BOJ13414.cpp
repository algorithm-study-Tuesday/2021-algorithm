#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;
int K,L;
map<int,int> order; 
vector<pair<int,int>> ans;
int main(){
	
	scanf("%d%d",&K,&L); 
	for(int i = 0 ; i < L ; i++){
		int sid;
		scanf("%d",&sid);
		order[sid] = i;
	}

	for(auto e : order){
		ans.emplace_back(e.second,e.first);
	}
	sort(ans.begin(),ans.end());
	int min_size = min(K, (int)ans.size());
	for(int i = 0 ; i < min_size ; i++){
		printf("%08d\n",ans[i].second);
	}
}
