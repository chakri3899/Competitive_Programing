#include<iostream>
#include<algorithm>
#include<vector>
#include<climits>
using namespace std;

int getsolution(vector<vector<pair<int,int> > > &adj,int s,int covered,int n,vector<bool> &visited,int &time)
{
	covered++;
	visited[s]=true;
	if(covered==n)
	return 1;
	for(int i=0;i<adj[s].size();i++)
	{
		if(visited[adj[s][i].second])
			continue;
		time+=adj[s][i].first;
		if(getsolution(adj,adj[s][i].second,covered,n,visited,time)==1)
		return 1;
		time-=adj[s][i].first;		
	}
	covered--;
	visited[s]=false;
	return 0;
	
}

int main()
{
	int n,m;
	cin>>n>>m;
	vector<vector<pair<int,int> > > adj(n);
	for(int i=0;i<m;i++)
	{
		int u,v,w;
		cin>>u>>v>>w;
		adj[u].push_back(make_pair(w,v));
		adj[v].push_back(make_pair(w,u));	
	}
	for(int i=0;i<n;i++)
	{
		sort(adj[i].begin(),adj[i].end());
	}
	int ans=INT_MAX;
	for(int s=0;s<n;s++)
	{
		vector<bool> visited(n,false);
		int time=0;
		int temp=getsolution(adj,s,0,n,visited,time);
		if(temp!=0)
		ans=min(ans,time);
	}
	if(ans==INT_MAX)
	cout<<-1;
	else
	cout<<ans;
	return 0;
}
